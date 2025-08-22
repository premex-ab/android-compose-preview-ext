package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ViewSonic device specifications for Android Compose previews.
 *
 * This extension provides ViewSonic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Viewsonic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Viewsonic: Any
  get() = object {
      /** ViewSonic IFP34 */
      val IFP34 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** ViewSonic IFP51 */
      val IFP51 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** ViewSonic IFP8652-2 */
      val IFP8652_2 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** ViewSonic IN02_series */
      val IN02_SERIES = "spec:width=2160,height=3840,unit=px,dpi=420"

      /** ViewSonic mid1016_ma */
      val MID1016_MA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ViewSonic mid1032_mk */
      val MID1032_MK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ViewSonic mid7015_mk_32 */
      val MID7015_MK_32 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ViewSonic VPC-A31-O1 */
      val VPC_A31_O1 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** ViewSonic VSD242 */
      val VSD242 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
