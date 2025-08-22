package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BRAVIS device specifications for Android Compose previews.
 *
 * This extension provides BRAVIS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BRAVIS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BRAVIS: Any
  get() = object {
      /** DeviceSpec(manufacturer=BRAVIS, code=A511_Harmony, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRAVIS, code=A511_Harmony,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val A511_HARMONY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BRAVIS, code=A512_Harmony_Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRAVIS, code=A512_Harmony_Pro,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val A512_HARMONY_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BRAVIS, code=BRAVIS_X500, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRAVIS, code=BRAVIS_X500,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BRAVIS_X500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BRAVIS, code=N1_550_Cruiser, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRAVIS, code=N1_550_Cruiser,
      width=640, height=1280, dpi=320, isGoogleDevice=false).code */
      val N1_550_CRUISER = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BRAVIS, code=N1-570-Space, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BRAVIS, code=N1-570-Space,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val N1_570_SPACE = "spec:width=720,height=1440,unit=px,dpi=320"

  }
