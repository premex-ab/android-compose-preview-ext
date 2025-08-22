package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mondial device specifications for Android Compose previews.
 *
 * This extension provides Mondial device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mondial.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mondial: Any
  get() = object {
      /** Mondial TB_MONDIAL_KID */
      val TB_MONDIAL_KID = "spec:width=600,height=1024,unit=px,dpi=160"

  }
