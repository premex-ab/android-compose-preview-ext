package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALPHALING device specifications for Android Compose previews.
 *
 * This extension provides ALPHALING device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alphaling.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alphaling: Any
  get() = object {
      /** ALPHALING A94GT_Plus */
      val A94GT_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ALPHALING A97GT */
      val A97GT = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ALPHALING A97GT_Pro */
      val A97GT_PRO = "spec:width=800,height=1280,unit=px,dpi=200"

  }
