package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QUEST device specifications for Android Compose previews.
 *
 * This extension provides QUEST device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QUEST.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QUEST: Any
  get() = object {
      /** QUEST Q7_Tablet */
      val Q7_TABLET = "spec:width=600,height=1024,unit=px,dpi=213"

      /** QUEST Q8_Tablet */
      val Q8_TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

      /** QUEST RAPTOR */
      val RAPTOR = "spec:width=480,height=960,unit=px,dpi=213"

      /** QUEST VISION */
      val VISION = "spec:width=720,height=1600,unit=px,dpi=320"

  }
