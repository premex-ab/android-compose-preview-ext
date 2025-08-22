package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PREMIO device specifications for Android Compose previews.
 *
 * This extension provides PREMIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PREMIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PREMIO: Any
  get() = object {
      /** PREMIO P520 */
      val P520 = "spec:width=480,height=854,unit=px,dpi=240"

      /** PREMIO S51 */
      val S51 = "spec:width=480,height=854,unit=px,dpi=240"

      /** PREMIO S53 */
      val S53 = "spec:width=480,height=854,unit=px,dpi=213"

      /** PREMIO S73 */
      val S73 = "spec:width=480,height=960,unit=px,dpi=240"

      /** PREMIO S80 */
      val S80 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** PREMIO S81 */
      val S81 = "spec:width=480,height=960,unit=px,dpi=213"

      /** PREMIO S82 */
      val S82 = "spec:width=480,height=960,unit=px,dpi=213"

      /** PREMIO S83 */
      val S83 = "spec:width=480,height=960,unit=px,dpi=198"

      /** PREMIO S84 */
      val S84 = "spec:width=480,height=960,unit=px,dpi=198"

      /** PREMIO S85 */
      val S85 = "spec:width=480,height=960,unit=px,dpi=198"

      /** PREMIO S88 */
      val S88 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** PREMIO S89 */
      val S89 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** PREMIO S93 */
      val S93 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** PREMIO TAB7 */
      val TAB7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** PREMIO TAB8 */
      val TAB8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PREMIO TAB_7_1 */
      val TAB_7_1 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** PREMIO TAB_8_1 */
      val TAB_8_1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** PREMIO X76 */
      val X76 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** PREMIO X77 */
      val X77 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** PREMIO X82 */
      val X82 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** PREMIO X87 */
      val X87 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** PREMIO X88 */
      val X88 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** PREMIO X95 */
      val X95 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** PREMIO X96 */
      val X96 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** PREMIO X97 */
      val X97 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** PREMIO Z1 */
      val Z1 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
