package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * freetel device specifications for Android Compose previews.
 *
 * This extension provides freetel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Freetel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Freetel: Any
  get() = object {
      /** freetel FTJ152A */
      val FTJ152A = "spec:width=480,height=854,unit=px,dpi=240"

      /** freetel FTJ152B */
      val FTJ152B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** freetel FTJ152C */
      val FTJ152C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** freetel ICE2 */
      val ICE2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** freetel Priori4 */
      val PRIORI4 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
