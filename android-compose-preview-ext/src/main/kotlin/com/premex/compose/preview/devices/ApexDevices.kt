package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * APEX device specifications for Android Compose previews.
 *
 * This extension provides APEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Apex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Apex: Any
  get() = object {
      /** APEX APEX_P10HD_PRO */
      val APEX_P10HD_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** APEX P10HD_Lite */
      val P10HD_LITE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** APEX R10D */
      val R10D = "spec:width=800,height=1280,unit=px,dpi=213"

      /** APEX T40PRO_L1 */
      val T40PRO_L1 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** APEX U10 */
      val U10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** APEX U10PRO */
      val U10PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** APEX Z12_PRO */
      val Z12_PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** APEX Z4PRO */
      val Z4PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
