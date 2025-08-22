package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TATUNG device specifications for Android Compose previews.
 *
 * This extension provides TATUNG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tatung.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tatung: Any
  get() = object {
      /** TATUNG gangbyeon */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TATUNG mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TATUNG pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
