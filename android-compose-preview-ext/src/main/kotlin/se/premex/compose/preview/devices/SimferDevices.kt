package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * simfer device specifications for Android Compose previews.
 *
 * This extension provides simfer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Simfer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Simfer: Any
  get() = object {
      /** simfer kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** simfer lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
