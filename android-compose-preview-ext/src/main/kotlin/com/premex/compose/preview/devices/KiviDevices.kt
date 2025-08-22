package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KIVI device specifications for Android Compose previews.
 *
 * This extension provides KIVI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kivi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kivi: Any
  get() = object {
      /** KIVI bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KIVI bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KIVI komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KIVI shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KIVI stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KIVI zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
