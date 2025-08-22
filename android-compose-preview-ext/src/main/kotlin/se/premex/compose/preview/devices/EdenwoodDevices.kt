package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EDENWOOD device specifications for Android Compose previews.
 *
 * This extension provides EDENWOOD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Edenwood.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Edenwood: Any
  get() = object {
      /** EDENWOOD bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EDENWOOD kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EDENWOOD komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

  }
