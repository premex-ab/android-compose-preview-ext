package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EON device specifications for Android Compose previews.
 *
 * This extension provides EON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EON: Any
  get() = object {
      /** EON DV8945C-KSU */
      val DV8945C_KSU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
