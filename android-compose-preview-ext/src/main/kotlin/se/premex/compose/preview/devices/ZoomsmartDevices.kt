package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZOOMSMART device specifications for Android Compose previews.
 *
 * This extension provides ZOOMSMART device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zoomsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zoomsmart: Any
  get() = object {
      /** ZOOMSMART LT600T */
      val LT600T = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** ZOOMSMART LT800 */
      val LT800 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** ZOOMSMART ZM800 */
      val ZM800 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
