package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VEON device specifications for Android Compose previews.
 *
 * This extension provides VEON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Veon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Veon: Any
  get() = object {
      /** VEON bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VEON bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VEON SEI103 */
      val SEI103 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VEON SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
