package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * geaneePro device specifications for Android Compose previews.
 *
 * This extension provides geaneePro device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GeaneePro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GeaneePro: Any
  get() = object {
      /** geaneePro JT07-X */
      val JT07_X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** geaneePro JT08-X1 */
      val JT08_X1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** geaneePro JT10LTE-X1 */
      val JT10LTE_X1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** geaneePro JT10LTE-X1S */
      val JT10LTE_X1S = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** geaneePro JT10-X */
      val JT10_X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** geaneePro JT10-X1 */
      val JT10_X1 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
