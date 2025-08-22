package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * condor device specifications for Android Compose previews.
 *
 * This extension provides condor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Condor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Condor: Any
  get() = object {
      /** condor PGN409 */
      val PGN409 = "spec:width=480,height=800,unit=px,dpi=240"

      /** condor PGN511 */
      val PGN511 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** condor PGN513 */
      val PGN513 = "spec:width=480,height=854,unit=px,dpi=240"

      /** condor PGN514 */
      val PGN514 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** condor PGN515 */
      val PGN515 = "spec:width=480,height=854,unit=px,dpi=240"

      /** condor PGN516 */
      val PGN516 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** condor PGN517 */
      val PGN517 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** condor PGN518 */
      val PGN518 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** condor PGN521 */
      val PGN521 = "spec:width=480,height=854,unit=px,dpi=240"

      /** condor PGN522 */
      val PGN522 = "spec:width=480,height=854,unit=px,dpi=240"

      /** condor PGN523 */
      val PGN523 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** condor PGN527 */
      val PGN527 = "spec:width=480,height=854,unit=px,dpi=240"

      /** condor PGN528 */
      val PGN528 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** condor PGN605 */
      val PGN605 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** condor PGN606 */
      val PGN606 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** condor PGN607 */
      val PGN607 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** condor PGN608 */
      val PGN608 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** condor PGN609 */
      val PGN609 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** condor PGN610 */
      val PGN610 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** condor PGN611 */
      val PGN611 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** condor PGN612 */
      val PGN612 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** condor PHQ520 */
      val PHQ520 = "spec:width=480,height=854,unit=px,dpi=240"

      /** condor TGW102L */
      val TGW102L = "spec:width=800,height=1280,unit=px,dpi=180"

      /** condor TGW801G */
      val TGW801G = "spec:width=800,height=1280,unit=px,dpi=180"

      /** condor TGW801L */
      val TGW801L = "spec:width=800,height=1280,unit=px,dpi=180"

  }
