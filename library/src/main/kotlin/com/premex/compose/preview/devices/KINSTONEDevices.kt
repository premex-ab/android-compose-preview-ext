package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KINSTONE device specifications for Android Compose previews.
 *
 * This extension provides KINSTONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KINSTONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KINSTONE: Any
  get() = object {
      /** KINSTONE KST102SF */
      val KST102SF = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KINSTONE KST102SF_EA */
      val KST102SF_EA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KINSTONE KST103SD_J */
      val KST103SD_J = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** KINSTONE KST103SD-L */
      val KST103SD_L = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
