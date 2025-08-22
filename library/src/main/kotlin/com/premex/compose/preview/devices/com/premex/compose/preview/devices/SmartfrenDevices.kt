package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smartfren device specifications for Android Compose previews.
 *
 * This extension provides Smartfren device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smartfren.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smartfren: Any
  get() = object {
      /** DeviceSpec(manufacturer=Smartfren, code=A16C3H, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartfren, code=A16C3H, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A16C3H = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Smartfren, code=A26C4H, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartfren, code=A26C4H, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A26C4H = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Smartfren, code=A36C5H, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartfren, code=A36C5H, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A36C5H = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Smartfren, code=B16C2H, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartfren, code=B16C2H, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val B16C2H = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Smartfren, code=B26D2H, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartfren, code=B26D2H, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val B26D2H = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Smartfren, code=G36C1H, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartfren, code=G36C1H, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val G36C1H = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Smartfren, code=HS8916QC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartfren, code=HS8916QC,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val HS8916QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Smartfren, code=HS8929QC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartfren, code=HS8929QC,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val HS8929QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Smartfren, code=MSM8909QC, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Smartfren, code=MSM8909QC,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val MSM8909QC = "spec:width=480,height=854,unit=px,dpi=240"

  }
