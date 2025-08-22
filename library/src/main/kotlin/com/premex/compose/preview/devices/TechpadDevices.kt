package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Techpad device specifications for Android Compose previews.
 *
 * This extension provides Techpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Techpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Techpad: Any
  get() = object {
      /** Techpad M55_4G */
      val M55_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** Techpad M5GO */
      val M5GO = "spec:width=480,height=960,unit=px,dpi=240"

      /** Techpad Note_4CAM_R */
      val NOTE_4CAM_R = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Techpad S6 */
      val S6 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
