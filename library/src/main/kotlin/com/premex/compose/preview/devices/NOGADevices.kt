package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOGA device specifications for Android Compose previews.
 *
 * This extension provides NOGA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOGA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOGA: Any
  get() = object {
      /** NOGA NOGA101GHD */
      val NOGA101GHD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** NOGA NOGA7G */
      val NOGA7G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NOGA NOGAPAD101GHD */
      val NOGAPAD101GHD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** NOGA NOGAPAD101XTREME */
      val NOGAPAD101XTREME = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** NOGA NOGAPAD7G */
      val NOGAPAD7G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
