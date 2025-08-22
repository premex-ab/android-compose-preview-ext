package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Axioo device specifications for Android Compose previews.
 *
 * This extension provides Axioo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Axioo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Axioo: Any
  get() = object {
      /** Axioo PICOpad_7H_R8 */
      val PICOPAD_7H_R8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
