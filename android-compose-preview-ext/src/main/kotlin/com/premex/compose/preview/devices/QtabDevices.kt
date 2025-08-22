package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QTab device specifications for Android Compose previews.
 *
 * This extension provides QTab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qtab: Any
  get() = object {
      /** QTab QTab_V100 */
      val QTAB_V100 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** QTab QTab_V500 */
      val QTAB_V500 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** QTab V5 */
      val V5 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** QTab V5_Plus */
      val V5_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** QTab V6_Metal */
      val V6_METAL = "spec:width=600,height=1024,unit=px,dpi=213"

      /** QTab V7_LTE */
      val V7_LTE = "spec:width=600,height=1024,unit=px,dpi=213"

      /** QTab V7_Metal */
      val V7_METAL = "spec:width=600,height=1024,unit=px,dpi=213"

  }
