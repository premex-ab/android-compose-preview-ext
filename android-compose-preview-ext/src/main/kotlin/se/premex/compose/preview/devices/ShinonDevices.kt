package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SHINON device specifications for Android Compose previews.
 *
 * This extension provides SHINON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Shinon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Shinon: Any
  get() = object {
      /** SHINON ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHINON longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SHINON redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SHINON samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
