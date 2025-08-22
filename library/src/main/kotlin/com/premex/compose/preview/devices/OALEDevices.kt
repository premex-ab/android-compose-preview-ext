package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OALE device specifications for Android Compose previews.
 *
 * This extension provides OALE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OALE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OALE: Any
  get() = object {
      /** OALE Apex1 */
      val APEX1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OALE Apex2 */
      val APEX2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OALE Apex3 */
      val APEX3 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** OALE dbx */
      val DBX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OALE P2 */
      val P2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OALE P3 */
      val P3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OALE P5S */
      val P5S = "spec:width=480,height=854,unit=px,dpi=240"

      /** OALE XS2_LTE */
      val XS2_LTE = "spec:width=720,height=1520,unit=px,dpi=320"

  }
