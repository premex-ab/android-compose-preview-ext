package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Archos device specifications for Android Compose previews.
 *
 * This extension provides Archos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Archos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Archos: Any
  get() = object {
      /** Archos ac101bcv */
      val AC101BCV = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Archos ac101cpl */
      val AC101CPL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Archos ac101dne */
      val AC101DNE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Archos ac101ma */
      val AC101MA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Archos ac101xel */
      val AC101XEL = "spec:width=600,height=1024,unit=px,dpi=120"

      /** Archos ac50heplus */
      val AC50HEPLUS = "spec:width=720,height=1280,unit=px,dpi=280"

      /** Archos AC50PL4G */
      val AC50PL4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Archos ac55heplus */
      val AC55HEPLUS = "spec:width=720,height=1280,unit=px,dpi=280"

      /** Archos ac94fff */
      val AC94FFF = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Archos act101hd24g */
      val ACT101HD24G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Archos act105fhd4g */
      val ACT105FHD4G = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Archos act105fhdwful */
      val ACT105FHDWFUL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Archos hometablet */
      val HOMETABLET = "spec:width=600,height=1024,unit=px,dpi=160"

  }
