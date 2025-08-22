package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVOFORCE1 device specifications for Android Compose previews.
 *
 * This extension provides EVOFORCE1 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Evoforce1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Evoforce1: Any
  get() = object {
      /** EVOFORCE1 SEI800ABB */
      val SEI800ABB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800AS */
      val SEI800AS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800BR */
      val SEI800BR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800BS */
      val SEI800BS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800CB */
      val SEI800CB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800ESTL */
      val SEI800ESTL = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800MC */
      val SEI800MC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800MDCOM */
      val SEI800MDCOM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800MOBI */
      val SEI800MOBI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800RCN */
      val SEI800RCN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800SECV */
      val SEI800SECV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800TDS */
      val SEI800TDS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVOFORCE1 SEI800TV */
      val SEI800TV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
