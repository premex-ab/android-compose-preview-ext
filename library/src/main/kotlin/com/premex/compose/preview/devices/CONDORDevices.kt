package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CONDOR device specifications for Android Compose previews.
 *
 * This extension provides CONDOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CONDOR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CONDOR: Any
  get() = object {
      /** CONDOR phs601 */
      val PHS601 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CONDOR R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CONDOR R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CONDOR tcl_eu */
      val TCL_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
