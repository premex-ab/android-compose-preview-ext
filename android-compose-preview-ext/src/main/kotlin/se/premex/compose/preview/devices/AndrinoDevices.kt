package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * andrino device specifications for Android Compose previews.
 *
 * This extension provides andrino device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Andrino.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Andrino: Any
  get() = object {
      /** andrino bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** andrino komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

  }
