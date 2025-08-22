package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JP device specifications for Android Compose previews.
 *
 * This extension provides JP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jp: Any
  get() = object {
      /** JP TR10CS2_3 */
      val TR10CS2_3 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
