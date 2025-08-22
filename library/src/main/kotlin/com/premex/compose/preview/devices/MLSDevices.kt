package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MLS device specifications for Android Compose previews.
 *
 * This extension provides MLS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MLS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MLS: Any
  get() = object {
      /** MLS iQ1012N */
      val IQ1012N = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MLS IQ1019N */
      val IQ1019N = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** MLS iQ1060M */
      val IQ1060M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MLS iQ1568 */
      val IQ1568 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MLS iQ181011N */
      val IQ181011N = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MLS iQ5011_E */
      val IQ5011_E = "spec:width=720,height=1500,unit=px,dpi=320"

      /** MLS iQ8011 */
      val IQ8011 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** MLS iQ9013_4N */
      val IQ9013_4N = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MLS iQA27X_E */
      val IQA27X_E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MLS iQD10S */
      val IQD10S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** MLS iQD700 */
      val IQD700 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MLS iQE200 */
      val IQE200 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MLS iQGW516 */
      val IQGW516 = "spec:width=480,height=854,unit=px,dpi=240"

      /** MLS iQL550 */
      val IQL550 = "spec:width=540,height=1132,unit=px,dpi=240"

      /** MLS iQL626 */
      val IQL626 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** MLS iQM960 */
      val IQM960 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MLS iQM960L */
      val IQM960L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MLS iQN700 */
      val IQN700 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** MLS iQS1001 */
      val IQS1001 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MLS iQS300 */
      val IQS300 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MLS iQS805 */
      val IQS805 = "spec:width=480,height=960,unit=px,dpi=240"

      /** MLS iQT1161 */
      val IQT1161 = "spec:width=1080,height=1920,unit=px,dpi=280"

      /** MLS iQT800 */
      val IQT800 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** MLS iQW511T */
      val IQW511T = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MLS iQW608 */
      val IQW608 = "spec:width=480,height=960,unit=px,dpi=240"

      /** MLS iQW626 */
      val IQW626 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
