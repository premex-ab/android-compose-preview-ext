package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MGS device specifications for Android Compose previews.
 *
 * This extension provides MGS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mgs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mgs: Any
  get() = object {
      /** MGS bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MGS bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MGS komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

  }
