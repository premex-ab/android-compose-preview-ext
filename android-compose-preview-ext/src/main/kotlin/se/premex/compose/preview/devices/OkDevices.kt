package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * OK device specifications for Android Compose previews.
 *
 * This extension provides OK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ok.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ok: Any
  get() = object {
      /** OK bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** OK ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** OK kaitak */
      val KAITAK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** OK longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** OK osaki */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** OK redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** OK samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** OK shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** OK umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
