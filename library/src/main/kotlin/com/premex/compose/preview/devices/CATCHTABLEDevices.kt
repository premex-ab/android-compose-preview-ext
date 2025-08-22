package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CATCHTABLE device specifications for Android Compose previews.
 *
 * This extension provides CATCHTABLE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CATCHTABLE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CATCHTABLE: Any
  get() = object {
      /** CATCHTABLE AZ101FC */
      val AZ101FC = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** CATCHTABLE AZ101FCN */
      val AZ101FCN = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
