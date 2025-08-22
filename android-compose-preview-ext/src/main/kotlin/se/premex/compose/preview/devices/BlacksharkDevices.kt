package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * blackshark device specifications for Android Compose previews.
 *
 * This extension provides blackshark device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blackshark.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blackshark: Any
  get() = object {
      /** blackshark bullhead */
      val BULLHEAD = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** blackshark darklighter */
      val DARKLIGHTER = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** blackshark kaiser */
      val KAISER = "spec:width=720,height=1280,unit=px,dpi=320"

      /** blackshark kaiser-os */
      val KAISER_OS = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** blackshark klein */
      val KLEIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** blackshark mobius */
      val MOBIUS = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** blackshark penrose */
      val PENROSE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** blackshark shark */
      val SHARK = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** blackshark skywalker */
      val SKYWALKER = "spec:width=1080,height=2340,unit=px,dpi=440"

  }
