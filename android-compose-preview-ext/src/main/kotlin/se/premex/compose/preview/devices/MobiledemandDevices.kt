package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MobileDemand device specifications for Android Compose previews.
 *
 * This extension provides MobileDemand device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobiledemand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobiledemand: Any
  get() = object {
      /** MobileDemand Flex10AND */
      val FLEX10AND = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
