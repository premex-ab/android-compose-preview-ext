package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Onn device specifications for Android Compose previews.
 *
 * This extension provides Onn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Onn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Onn: Any
  get() = object {
      /** Onn stephen */
      val STEPHEN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Onn sti6140d360 */
      val STI6140D360 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
