package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GFIVE device specifications for Android Compose previews.
 *
 * This extension provides GFIVE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gfive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gfive: Any
  get() = object {
      /** GFIVE GPAD702 */
      val GPAD702 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** GFIVE PRESIDENT_GOLD_10 */
      val PRESIDENT_GOLD_10 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** GFIVE PRESIDENT_GOLD_9 */
      val PRESIDENT_GOLD_9 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** GFIVE Speedo_1 */
      val SPEEDO_1 = "spec:width=480,height=960,unit=px,dpi=213"

      /** GFIVE Stark */
      val STARK = "spec:width=480,height=960,unit=px,dpi=240"

  }
