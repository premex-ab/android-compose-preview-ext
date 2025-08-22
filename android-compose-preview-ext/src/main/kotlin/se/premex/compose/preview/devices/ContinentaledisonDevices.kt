package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ContinentalEdison device specifications for Android Compose previews.
 *
 * This extension provides ContinentalEdison device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Continentaledison.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Continentaledison: Any
  get() = object {
      /** ContinentalEdison cottongreen */
      val COTTONGREEN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ContinentalEdison guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ContinentalEdison kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ContinentalEdison lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ContinentalEdison marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ContinentalEdison martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ContinentalEdison nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
