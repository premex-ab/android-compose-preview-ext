package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MTC device specifications for Android Compose previews.
 *
 * This extension provides MTC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MTC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MTC: Any
  get() = object {
      /** MTC Osmartphona */
      val OSMARTPHONA = "spec:width=480,height=854,unit=px,dpi=213"

      /** MTC Osmartphona_Tablet */
      val OSMARTPHONA_TABLET = "spec:width=800,height=1280,unit=px,dpi=220"

      /** MTC SMART_Race2_4G */
      val SMART_RACE2_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** MTC SMART_Sprint_4G */
      val SMART_SPRINT_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** MTC SMART_Surf2_4G */
      val SMART_SURF2_4G = "spec:width=720,height=1280,unit=px,dpi=320"

  }
