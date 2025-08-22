package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COMIO device specifications for Android Compose previews.
 *
 * This extension provides COMIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COMIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COMIO: Any
  get() = object {
      /** COMIO ComioC1 */
      val COMIOC1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** COMIO ComioC1Pro */
      val COMIOC1PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** COMIO ComioC2 */
      val COMIOC2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** COMIO ComioC2Lite */
      val COMIOC2LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** COMIO ComioP1 */
      val COMIOP1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** COMIO ComioS1 */
      val COMIOS1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** COMIO ComioS1Lite */
      val COMIOS1LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** COMIO ComioX1 */
      val COMIOX1 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
