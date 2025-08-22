package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Smartron device specifications for Android Compose previews.
 *
 * This extension provides Smartron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smartron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smartron: Any
  get() = object {
      /** Smartron P840F12 */
      val P840F12 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Smartron rimo01a */
      val RIMO01A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Smartron rimo02a */
      val RIMO02A = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
