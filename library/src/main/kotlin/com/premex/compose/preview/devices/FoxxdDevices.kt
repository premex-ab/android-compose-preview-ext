package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FOXXD device specifications for Android Compose previews.
 *
 * This extension provides FOXXD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Foxxd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Foxxd: Any
  get() = object {
      /** FOXXD A2023 */
      val A2023 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** FOXXD A55 */
      val A55 = "spec:width=480,height=960,unit=px,dpi=200"

      /** FOXXD A551 */
      val A551 = "spec:width=480,height=960,unit=px,dpi=200"

      /** FOXXD A56 */
      val A56 = "spec:width=480,height=960,unit=px,dpi=200"

      /** FOXXD A5Pro */
      val A5PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** FOXXD A62 */
      val A62 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** FOXXD A65 */
      val A65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** FOXXD A65L */
      val A65L = "spec:width=540,height=1200,unit=px,dpi=200"

      /** FOXXD A65Plus */
      val A65PLUS = "spec:width=720,height=1600,unit=px,dpi=300"

      /** FOXXD A67L */
      val A67L = "spec:width=720,height=1600,unit=px,dpi=320"

      /** FOXXD AS65U */
      val AS65U = "spec:width=576,height=1280,unit=px,dpi=240"

      /** FOXXD C10 */
      val C10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** FOXXD FOXXD_C65 */
      val FOXXD_C65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** FOXXD HTH_C67 */
      val HTH_C67 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** FOXXD HTH_S67 */
      val HTH_S67 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** FOXXD L590A */
      val L590A = "spec:width=640,height=1280,unit=px,dpi=240"

      /** FOXXD N5 */
      val N5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** FOXXD P8 */
      val P8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** FOXXD T55 */
      val T55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** FOXXD T8 */
      val T8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FOXXD T8Plus */
      val T8PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FOXXD T8Pro */
      val T8PRO = "spec:width=800,height=1280,unit=px,dpi=240"

  }
