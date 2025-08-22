package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cat device specifications for Android Compose previews.
 *
 * This extension provides Cat device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cat: Any
  get() = object {
      /** Cat BM1S1B */
      val BM1S1B = "spec:width=1080,height=2408,unit=px,dpi=400"

      /** Cat CatB15Q */
      val CATB15Q = "spec:width=480,height=800,unit=px,dpi=240"

      /** Cat CatS30 */
      val CATS30 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Cat CatS31 */
      val CATS31 = "spec:width=720,height=1280,unit=px,dpi=280"

      /** Cat CatS40 */
      val CATS40 = "spec:width=540,height=960,unit=px,dpi=240"

      /** Cat CatS41 */
      val CATS41 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** Cat CatS48c */
      val CATS48C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Cat CatS50 */
      val CATS50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cat CatS52 */
      val CATS52 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** Cat CatS60 */
      val CATS60 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cat CatS61 */
      val CATS61 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** Cat S22FLIP */
      val S22FLIP = "spec:width=480,height=640,unit=px,dpi=240"

      /** Cat S42 */
      val S42 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** Cat S42G */
      val S42G = "spec:width=720,height=1440,unit=px,dpi=280"

      /** Cat S62 */
      val S62 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** Cat S62Pro */
      val S62PRO = "spec:width=1080,height=2160,unit=px,dpi=420"

  }
