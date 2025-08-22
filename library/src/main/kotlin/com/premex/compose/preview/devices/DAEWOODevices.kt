package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAEWOO device specifications for Android Compose previews.
 *
 * This extension provides DAEWOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DAEWOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DAEWOO: Any
  get() = object {
      /** DAEWOO beomil */
      val BEOMIL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DAEWOO lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DAEWOO mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DAEWOO pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DAEWOO SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DAEWOO X7 */
      val X7 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DAEWOO X9 */
      val X9 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
