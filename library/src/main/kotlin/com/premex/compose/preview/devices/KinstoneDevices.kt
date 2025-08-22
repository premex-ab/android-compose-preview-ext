package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kinstone device specifications for Android Compose previews.
 *
 * This extension provides Kinstone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kinstone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kinstone: Any
  get() = object {
      /** Kinstone CON_102 */
      val CON_102 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Kinstone Kinstone_SA070 */
      val KINSTONE_SA070 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Kinstone KST102SA-EEA */
      val KST102SA_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Kinstone KST103RC */
      val KST103RC = "spec:width=1200,height=1920,unit=px,dpi=288"

      /** Kinstone KST103SD */
      val KST103SD = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
