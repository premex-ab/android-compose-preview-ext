package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TECO device specifications for Android Compose previews.
 *
 * This extension provides TECO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teco: Any
  get() = object {
      /** TECO ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TECO longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TECO samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
