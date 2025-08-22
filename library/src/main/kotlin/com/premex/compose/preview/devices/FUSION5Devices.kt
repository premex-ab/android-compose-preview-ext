package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FUSION5 device specifications for Android Compose previews.
 *
 * This extension provides FUSION5 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FUSION5.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FUSION5: Any
  get() = object {
      /** FUSION5 F104Bv2_PRO */
      val F104BV2_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FUSION5 F104BvII_PRO */
      val F104BVII_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FUSION5 F104EvII_PRO */
      val F104EVII_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FUSION5 F104EvII_PRO_EEA */
      val F104EVII_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FUSION5 F704Bv2 */
      val F704BV2 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
