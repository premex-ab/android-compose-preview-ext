package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLECK device specifications for Android Compose previews.
 *
 * This extension provides BLECK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bleck.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bleck: Any
  get() = object {
      /** BLECK BE_dg */
      val BE_DG = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLECK BE_et */
      val BE_ET = "spec:width=480,height=854,unit=px,dpi=240"

      /** BLECK BE_o2 */
      val BE_O2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BLECK BE_se */
      val BE_SE = "spec:width=480,height=960,unit=px,dpi=240"

      /** BLECK BE_xl */
      val BE_XL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
