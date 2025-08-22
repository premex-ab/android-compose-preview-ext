package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mbs device specifications for Android Compose previews.
 *
 * This extension provides mbs device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mbs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mbs: Any
  get() = object {
      /** mbs bluefish */
      val BLUEFISH = "spec:width=416,height=416,unit=px,dpi=320"

      /** mbs coralia */
      val CORALIA = "spec:width=416,height=416,unit=px,dpi=320"

      /** mbs icefish */
      val ICEFISH = "spec:width=390,height=390,unit=px,dpi=320"

      /** mbs lionfish */
      val LIONFISH = "spec:width=400,height=400,unit=px,dpi=280"

      /** mbs triton */
      val TRITON = "spec:width=390,height=390,unit=px,dpi=320"

  }
