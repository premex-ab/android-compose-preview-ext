package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * carp device specifications for Android Compose previews.
 *
 * This extension provides carp device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Carp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Carp: Any
  get() = object {
      /** carp kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** carp lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
