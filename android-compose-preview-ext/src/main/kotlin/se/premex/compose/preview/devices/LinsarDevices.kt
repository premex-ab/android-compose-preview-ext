package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Linsar device specifications for Android Compose previews.
 *
 * This extension provides Linsar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Linsar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Linsar: Any
  get() = object {
      /** Linsar bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Linsar komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Linsar sadang */
      val SADANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Linsar ueno */
      val UENO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
