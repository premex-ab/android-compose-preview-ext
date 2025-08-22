package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Beeline device specifications for Android Compose previews.
 *
 * This extension provides Beeline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Beeline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Beeline: Any
  get() = object {
      /** Beeline Beeline_Pro_6 */
      val BEELINE_PRO_6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Beeline SWG2001A */
      val SWG2001A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Beeline z701 */
      val Z701 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
