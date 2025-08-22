package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VU device specifications for Android Compose previews.
 *
 * This extension provides VU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vu: Any
  get() = object {
      /** VU hamamatsucho */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VU hengshan */
      val HENGSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** VU huangshan */
      val HUANGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VU ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VU keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VU laoshan */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VU longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VU lushan */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** VU samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VU songshan */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VU wuyishan */
      val WUYISHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VU xiaoyushan */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
