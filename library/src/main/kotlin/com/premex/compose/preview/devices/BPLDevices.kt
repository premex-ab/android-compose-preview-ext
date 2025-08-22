package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BPL device specifications for Android Compose previews.
 *
 * This extension provides BPL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BPL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BPL: Any
  get() = object {
      /** BPL ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BPL OD0M_EA_T32 */
      val OD0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BPL R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BPL redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BPL samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BPL takao */
      val TAKAO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BPL tcl_eu */
      val TCL_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
