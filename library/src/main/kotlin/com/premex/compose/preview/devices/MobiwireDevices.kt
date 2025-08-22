package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MobiWire device specifications for Android Compose previews.
 *
 * This extension provides MobiWire device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobiwire.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobiwire: Any
  get() = object {
      /** MobiWire Cygnus_mini */
      val CYGNUS_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** MobiWire H5032U */
      val H5032U = "spec:width=480,height=854,unit=px,dpi=200"

      /** MobiWire Halona */
      val HALONA = "spec:width=320,height=480,unit=px,dpi=160"

      /** MobiWire Hotah */
      val HOTAH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MobiWire IKOSORA_Plus */
      val IKOSORA_PLUS = "spec:width=480,height=854,unit=px,dpi=200"

      /** MobiWire K5P_4G */
      val K5P_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** MobiWire Kicka_4_Plus */
      val KICKA_4_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** MobiWire Kicka_5 */
      val KICKA_5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** MobiWire Kicka_5_Plus */
      val KICKA_5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** MobiWire Kicka_5_U */
      val KICKA_5_U = "spec:width=720,height=1600,unit=px,dpi=300"

      /** MobiWire Kicka_Zoom */
      val KICKA_ZOOM = "spec:width=480,height=960,unit=px,dpi=240"

      /** MobiWire MobiWire_Verda */
      val MOBIWIRE_VERDA = "spec:width=480,height=960,unit=px,dpi=200"

      /** MobiWire Smart_E11 */
      val SMART_E11 = "spec:width=480,height=960,unit=px,dpi=240"

      /** MobiWire Smart_N11 */
      val SMART_N11 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** MobiWire Smart_N12 */
      val SMART_N12 = "spec:width=444,height=960,unit=px,dpi=200"

      /** MobiWire Smart_P24 */
      val SMART_P24 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** MobiWire Smart_T23 */
      val SMART_T23 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** MobiWire Smart_V22 */
      val SMART_V22 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** MobiWire Vodafone_Pro */
      val VODAFONE_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** MobiWire Vodafone_Smart */
      val VODAFONE_SMART = "spec:width=444,height=960,unit=px,dpi=200"

  }
